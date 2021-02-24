package com.example.firsttry

import kotlinx.coroutines.flow.Flow
import java.util.concurrent.Executor
import java.util.concurrent.TimeUnit

class Reprository @Inject constructor(
    private val GitHubServie: GitHubService,
    private val executor: Executor,
    private val RaMDao: RaMDAO
){
    private val ApiInterface: GitHubService = TODO()

    fun listRepos(): Flow<RaM> {
        refreshUser()
        // Returns a Flow object directly from the database.
        return RaMDao.load()
    }
    private fun refreshUser() {

        val userExists = RaMDAO.hasUser(FRESH_TIMEOUT)
        if (!userExists) {

            val response = GitHubServie.listRepos()
            RaMDao.save(response.body()!!)
        }
    }
    companion object {
        val FRESH_TIMEOUT = TimeUnit.DAYS.toMillis(1)
    }
}