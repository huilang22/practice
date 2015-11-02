/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdActionSequenceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdActionSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdActionSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdActionObjectKeyData noOpIn;

/**
 *
 * Constructor to create a   BsdActionSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdActionSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdActionObjectKeyData noOpInIn) {
    super(id, context, "BsdActionSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdAction", BsdActionObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdAction").get("BsdAction"));
    }
  }
/**
 *
 * Sets the  BsdAction
 * @param noOpInIn BsdActionObjectKeyData to set
 *
 */
  public void setBsdAction(BsdActionObjectKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdAction passed into the constructor
 * @return Simulated response
 *
 */
  public BsdActionObjectKeyData getBsdAction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdActionObjectKeyHelper.fromMap(inputMap, "BsdAction");
  }
}
