package com.example.dagger_test2.network

import java.security.acl.Owner

data class RecyclerList(val items: List<RecyclerData>)
data class RecyclerData(val name: String, val description: String?, val owner: com.example.dagger_test2.network.Owner?)
data class Owner(val avatar_url : String)
