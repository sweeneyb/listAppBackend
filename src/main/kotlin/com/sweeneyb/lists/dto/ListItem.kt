package com.sweeneyb.lists.dto

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import java.time.LocalTime
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class ListItem(
        @Id val id: LocalTime=LocalTime.now(),
        val isDone: Boolean = false,
        val task: String = "")

@RepositoryRestResource
interface ListItemRepository : PagingAndSortingRepository<ListItem, LocalTime>