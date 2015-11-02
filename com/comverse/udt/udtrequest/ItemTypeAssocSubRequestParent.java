/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeAssocSubRequestParent.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import com.csgsystems.udt.UdtSubRequestParent;
import com.csgsystems.udt.SubRequestWrapper;
import com.csgsystems.udt.SubRequestData;
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * Abstract base class for all ItemTypeAssoc related UdtSubRequestParents
 *
 */
public abstract class ItemTypeAssocSubRequestParent extends UdtSubRequestParent {


/**
 *
 * Adds SelfRequest based on ItemTypeAssocRequest
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemTypeAssocRequest selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }
/**
 *
 * Adds SelfRequest based on ItemTypeAssocSubRequestParent
 * @param selfRequest self request to add
 *
 */
    public void addSelfRequest(ItemTypeAssocSubRequestParent selfRequest) {
      requests.add(new SubRequestWrapper(selfRequest, new SubRequestData("SelfRequest", null)));
    }


/**
 *
 * Constructor for ItemTypeAssocSubRequestParent
 * @param id unique request identifier
 * @param method method to perform
 *
 */
  public ItemTypeAssocSubRequestParent(String id, String method) {
    super(id, "ItemTypeAssoc", method);
  }
}
