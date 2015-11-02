/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ArmStatusGetBulkUdtTemplateItem.java
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
 * Class used to create a ArmStatusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ArmStatusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ASObjectKeyData ASGetIn;
/**
 *
 * Constructor to create a  ArmStatusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ArmStatusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ASObjectKeyData ASGetInIn) {
    super(id, context, "ArmStatusGet");
    ASGetIn = ASGetInIn;
  }

  public void translateToMap() {
    if (ASGetIn != null) {
      ASGetIn.resetFlags(true, true);
      addInput("ArmStatus", ASObjectKeyHelper.toMap(ASGetIn, new HashMap(), "ASObjectKeyData").get("ASObjectKeyData"));
    }
  }


/**
 *
 * Sets the ArmStatus
 * @param ASGetInIn Value of the ASGetIn
 *
 */

  public void setArmStatus(ASObjectKeyData ASGetInIn) {
    ASGetIn = ASGetInIn;
  }

  public void translateFromMap() {
    ASGetIn = ASObjectKeyHelper.fromMap(inputMap, "ArmStatus");
  }

/**
 *
 * Gets the ArmStatus
 * @return Value of the ArmStatus
 *
 */

  public ASObjectKeyData getArmStatus( ) {
    return ASGetIn;
  }

}
