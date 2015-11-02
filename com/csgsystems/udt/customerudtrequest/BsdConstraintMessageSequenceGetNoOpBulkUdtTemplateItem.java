/*
 * Generated code DO NOT EDIT
 * Generated file: BsdConstraintMessageSequenceGetNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a BsdConstraintMessageSequenceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdConstraintMessageSequenceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdConstraintMessageObjectBaseKeyData noOpIn;

/**
 *
 * Constructor to create a   BsdConstraintMessageSequenceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdConstraintMessageSequenceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdConstraintMessageObjectBaseKeyData noOpInIn) {
    super(id, context, "BsdConstraintMessageSequenceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseKeyHelper.toMap(noOpIn, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }
/**
 *
 * Sets the  BsdConstraintMessage
 * @param noOpInIn BsdConstraintMessageObjectBaseKeyData to set
 *
 */
  public void setBsdConstraintMessage(BsdConstraintMessageObjectBaseKeyData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdConstraintMessage passed into the constructor
 * @return Simulated response
 *
 */
  public BsdConstraintMessageObjectBaseKeyData getBsdConstraintMessage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdConstraintMessageObjectBaseKeyHelper.fromMap(inputMap, "BsdConstraintMessage");
  }
}
