/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EquipClassCodeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EquipClassCodeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EquipClassCodeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ECCObjectData noOpIn;

/**
 *
 * Constructor to create a   EquipClassCodeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EquipClassCodeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ECCObjectData noOpInIn) {
    super(id, context, "EquipClassCodeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EquipClassCode", ECCObjectHelper.toMap(noOpIn, new HashMap(), "EquipClassCode").get("EquipClassCode"));
    }
  }
/**
 *
 * Sets the  EquipClassCode
 * @param noOpInIn ECCObjectData to set
 *
 */
  public void setEquipClassCode(ECCObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EquipClassCode passed into the constructor
 * @return Simulated response
 *
 */
  public ECCObjectData getEquipClassCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ECCObjectHelper.fromMap(inputMap, "EquipClassCode");
  }
}
