/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ChargeDisplayFormatCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ChargeDisplayFormatCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ChargeDisplayFormatCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ChargeDisplayFormatObjectData noOpIn;

/**
 *
 * Constructor to create a   ChargeDisplayFormatCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ChargeDisplayFormatCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ChargeDisplayFormatObjectData noOpInIn) {
    super(id, context, "ChargeDisplayFormatCreate");
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
