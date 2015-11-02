/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectDeleteNoOpBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdObjectDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdObjectDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdObjectObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdObjectDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdObjectDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectObjectData noOpInIn) {
    super(id, context, "BsdObjectDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdObject", BsdObjectObjectHelper.toMap(noOpIn, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }
/**
 *
 * Sets the  BsdObject
 * @param noOpInIn BsdObjectObjectData to set
 *
 */
  public void setBsdObject(BsdObjectObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdObject passed into the constructor
 * @return Simulated response
 *
 */
  public BsdObjectObjectData getBsdObject() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdObjectObjectHelper.fromMap(inputMap, "BsdObject");
  }
}
