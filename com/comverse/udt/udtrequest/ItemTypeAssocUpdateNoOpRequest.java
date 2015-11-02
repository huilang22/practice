/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ItemTypeAssocUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ItemTypeAssocUpdateNoOpRequest Udt Request/Response
 *
 */
public class ItemTypeAssocUpdateNoOpRequest extends ItemTypeAssocSubRequestParent {
/**
 *
 * Constructor to create a   ItemTypeAssocUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ItemTypeAssocUpdateNoOpRequest(String id, ItemTypeAssocObjData noOpIn) {
    super(id, "ItemTypeAssocUpdateNoOpRequest");
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
