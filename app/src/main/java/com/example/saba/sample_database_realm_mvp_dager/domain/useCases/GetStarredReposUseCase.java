package com.example.saba.sample_database_realm_mvp_dager.domain.useCases;

import com.example.saba.sample_database_realm_mvp_dager.domain.models.responseModels.RepoModel;
import com.example.saba.sample_database_realm_mvp_dager.domain.repository.Repository;
import com.example.saba.sample_database_realm_mvp_dager.domain.useCases.base.BaseUseCase;
import java.util.List;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import io.reactivex.Observable;

public class GetStarredReposUseCase extends BaseUseCase{

    @Inject
    GetStarredReposUseCase(@Nonnull Repository mRepository) {
        super(mRepository);
    }

    public Observable<List<RepoModel>> getStarredRepos(String userName){
        return mRepository.getStarredRepos(userName);
    }

}
