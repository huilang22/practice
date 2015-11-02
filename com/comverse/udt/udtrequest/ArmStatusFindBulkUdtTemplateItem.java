/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ArmStatusFindBulkUdtTemplateItem.java
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
 * Class used to create a ArmStatusFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ArmStatusFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ASObjectFilter ASFindIn;
/**
 *
 * Constructor to create a  ArmStatusFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ArmStatusFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ASObjectFilter ASFindInIn) {
    super(id, context, "ArmStatusFind");
    ASFindIn = ASFindInIn;
  }

  public void translateToMap() {
    if (ASFindIn != null) {
      Integer index =  ASFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ArmStatus", ASObjectHelper.toMap(ASFindIn, new HashMap(), "ArmStatus").get("ArmStatus"));
    }
  }


/**
 *
 * Sets the ArmStatus
 * @param ASFindInIn Value of the ASFindIn
 *
 */

  public void setArmStatus(ASObjectFilter ASFindInIn) {
    ASFindIn = ASFindInIn;
  }

  public void translateFromMap() {
    ASFindIn = ASObjectHelper.fromMapFilter(inputMap, "ArmStatus");
  }

/**
 *
 * Gets the ArmStatus
 * @return Value of the ArmStatus
 *
 */

  public ASObjectFilter getArmStatus( ) {
    return ASFindIn;
  }

}
