package work.wizmagic.app.bbs.domain.repository

import org.springframework.data.jpa.repository.JpaRepository
import work.wizmagic.app.bbs.domain.entity.Article

interface ArticleRepository : JpaRepository<Article, Int>