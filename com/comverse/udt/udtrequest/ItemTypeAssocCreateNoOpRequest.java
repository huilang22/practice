/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeAssocCreateNoOpRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ItemTypeAssocCreateNoOpRequest Udt Request/Response
 *
 */
public class ItemTypeAssocCreateNoOpRequest extends ItemTypeAssocSubRequestParent {
/**
 *
 * Constructor to create a   ItemTypeAssocCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemTypeAssocCreateNoOpRequest(String id, ItemTypeAssocObjData noOpIn) {
    super(id, "ItemTypeAssocCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ItemTypeAssoc", ItemTypeAssocObjHelper.toMap(noOpIn, new HashMap(), "ItemTypeAssoc").get("ItemTypeAssoc"));
    }
  }
/**
 *
 * Retrieves the ItemTypeAssocObjData passed into the constructor
 * @return Simulated response
 *
 */
  public ItemTypeAssocObjData getOutput() {
    return ItemTypeAssocObjHelper.fromMap(outputMap, "ItemTypeAssoc");
  }
}
