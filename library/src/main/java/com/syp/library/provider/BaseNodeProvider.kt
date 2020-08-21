package com.syp.library.provider

import com.syp.library.BaseNodeAdapter
import com.syp.library.entity.node.BaseNode

abstract class BaseNodeProvider : BaseItemProvider<BaseNode>() {

    override fun getAdapter(): BaseNodeAdapter? {
        return super.getAdapter() as? BaseNodeAdapter
    }
}