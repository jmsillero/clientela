package com.cubaback.unete.domain.interactor.user

import com.cubaback.unete.domain.model.UserBo
import com.cubaback.unete.domain.repository.IUserRepository
import io.reactivex.Flowable
import com.cubaback.unete.domain.executor.PostExecutionThread
import com.cubaback.unete.domain.executor.ThreadExecutor
import com.cubaback.unete.domain.interactor.base.FlowableUseCase

open class LoginUC(val userDataRepository: IUserRepository,
                   val threadExecutor: ThreadExecutor,
                   val porExecutionThread: PostExecutionThread) : FlowableUseCase<UserBo, UserBo?>(threadExecutor, porExecutionThread){



    override fun buildUseCaseObservable(params: UserBo?): Flowable<UserBo> {
        return params?.let { userDataRepository.login(it).toFlowable() } as Flowable<UserBo>
    }
}