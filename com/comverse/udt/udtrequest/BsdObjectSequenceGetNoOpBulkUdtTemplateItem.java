/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdObjectSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdObjectSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdObjectObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BsdObjectSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdObjectSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdObjectObjectKeyData noOpInIn) {
    super(id, context, "BsdObjectSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdObject", BsdObjectObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }
/**
 *
 * Sets the  BsdObject
 * @param noOpInIn BsdObjectObjectKeyData to set
 *
 */
  public void setBsdObject(BsdObjectObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdObject passed into the constructor
 * @return Simulated response
 *
 */
  public BsdObjectObjectKeyData getBsdObject() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdObjectObjectKeyHelper.fromMap(inputMap, "BsdObject");
  }
}
