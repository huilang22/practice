/*
 * Generated code DO NOT EDIT
 * Generated file: ChargeDisplayFormatGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ChargeDisplayFormatGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ChargeDisplayFormatGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ChargeDisplayFormatObjectData noOpIn;

/**
 *
 * Constructor to create a   ChargeDisplayFormatGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ChargeDisplayFormatGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ChargeDisplayFormatObjectData noOpInIn) {
    super(id, context, "ChargeDisplayFormatGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ChargeDisplayFormat", ChargeDisplayFormatObjectHelper.toMap(noOpIn, new HashMap(), "ChargeDisplayFormat").get("ChargeDisplayFormat"));
    }
  }
/**
 *
 * Sets the  ChargeDisplayFormat
 * @param noOpInIn ChargeDisplayFormatObjectData to set
 *
 */
  public void setChargeDisplayFormat(ChargeDisplayFormatObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ChargeDisplayFormat passed into the constructor
 * @return Simulated response
 *
 */
  public ChargeDisplayFormatObjectData getChargeDisplayFormat() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ChargeDisplayFormatObjectHelper.fromMap(inputMap, "ChargeDisplayFormat");
  }
}
