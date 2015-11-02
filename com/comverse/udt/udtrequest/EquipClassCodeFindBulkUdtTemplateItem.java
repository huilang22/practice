/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipClassCodeFindBulkUdtTemplateItem.java
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
 * Class used to create a EquipClassCodeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EquipClassCodeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ECCObjectFilter ECCFindIn;
/**
 *
 * Constructor to create a  EquipClassCodeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EquipClassCodeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, ECCObjectFilter ECCFindInIn) {
    super(id, context, "EquipClassCodeFind");
    ECCFindIn = ECCFindInIn;
  }

  public void translateToMap() {
    if (ECCFindIn != null) {
      Integer index =  ECCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EquipClassCode", ECCObjectHelper.toMap(ECCFindIn, new HashMap(), "EquipClassCode").get("EquipClassCode"));
    }
  }


/**
 *
 * Sets the EquipClassCode
 * @param ECCFindInIn Value of the ECCFindIn
 *
 */

  public void setEquipClassCode(ECCObjectFilter ECCFindInIn) {
    ECCFindIn = ECCFindInIn;
  }

  public void translateFromMap() {
    ECCFindIn = ECCObjectHelper.fromMapFilter(inputMap, "EquipClassCode");
  }

/**
 *
 * Gets the EquipClassCode
 * @return Value of the EquipClassCode
 *
 */

  public ECCObjectFilter getEquipClassCode( ) {
    return ECCFindIn;
  }

}
