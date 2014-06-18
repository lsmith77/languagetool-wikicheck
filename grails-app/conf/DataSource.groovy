dataSource {
    pooled = true
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            driverClassName = "com.mysql.jdbc.Driver"
            dbCreate = "update" // one of 'create', 'create-drop','update'
            url = "jdbc:mysql://localhost/lt-wikicheck?useUnicode=true&characterEncoding=UTF-8"
            username = "root"
            password = ""
        }
    }
    test {
        dataSource {
            driverClassName = "org.h2.Driver"
            dbCreate = "update"
            url = "jdbc:hsqldb:mem:testDb"
            username = "sa"
            password = ""
        }
    }
    production {
        dataSource {
            driverClassName = "com.mysql.jdbc.Driver"
            dbCreate = "update" // one of 'create', 'create-drop','update'
            url = "jdbc:mysql://tools-db/s52131__ltcommunity?useUnicode=true&characterEncoding=UTF-8"
            username = "s52131"
            password = ""
        }
    }
}
