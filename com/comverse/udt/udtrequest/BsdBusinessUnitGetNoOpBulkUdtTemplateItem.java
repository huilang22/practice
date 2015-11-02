/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdBusinessUnitGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdBusinessUnitGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdBusinessUnitGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdBusinessUnitObjectData noOpIn;

/**
 *
 * Constructor to create a   BsdBusinessUnitGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdBusinessUnitGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdBusinessUnitObjectData noOpInIn) {
    super(id, context, "BsdBusinessUnitGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectHelper.toMap(noOpIn, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }
/**
 *
 * Sets the  BsdBusinessUnit
 * @param noOpInIn BsdBusinessUnitObjectData to set
 *
 */
  public void setBsdBusinessUnit(BsdBusinessUnitObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdBusinessUnit passed into the constructor
 * @return Simulated response
 *
 */
  public BsdBusinessUnitObjectData getBsdBusinessUnit() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdBusinessUnitObjectHelper.fromMap(inputMap, "BsdBusinessUnit");
  }
}
