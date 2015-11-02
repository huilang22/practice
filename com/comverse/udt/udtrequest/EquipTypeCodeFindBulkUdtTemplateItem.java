/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipTypeCodeFindBulkUdtTemplateItem.java
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
 * Class used to create a EquipTypeCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EquipTypeCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ETGObjectFilter ETGFindIn;
/**
 *
 * Constructor to create a  EquipTypeCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EquipTypeCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ETGObjectFilter ETGFindInIn) {
    super(id, context, "EquipTypeCodeFind");
    ETGFindIn = ETGFindInIn;
  }

  public void translateToMap() {
    if (ETGFindIn != null) {
      Integer index =  ETGFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EquipTypeCode", ETGObjectHelper.toMap(ETGFindIn, new HashMap(), "EquipTypeCode").get("EquipTypeCode"));
    }
  }


/**
 *
 * Sets the EquipTypeCode
 * @param ETGFindInIn Value of the ETGFindIn
 *
 */

  public void setEquipTypeCode(ETGObjectFilter ETGFindInIn) {
    ETGFindIn = ETGFindInIn;
  }

  public void translateFromMap() {
    ETGFindIn = ETGObjectHelper.fromMapFilter(inputMap, "EquipTypeCode");
  }

/**
 *
 * Gets the EquipTypeCode
 * @return Value of the EquipTypeCode
 *
 */

  public ETGObjectFilter getEquipTypeCode( ) {
    return ETGFindIn;
  }

}
