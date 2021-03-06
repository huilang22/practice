/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitsTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UnitsTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UnitsTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UnitsTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   UnitsTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UnitsTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitsTypeObjectData noOpInIn) {
    super(id, context, "UnitsTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UnitsType", UnitsTypeObjectHelper.toMap(noOpIn, new HashMap(), "UnitsType").get("UnitsType"));
    }
  }
/**
 *
 * Sets the  UnitsType
 * @param noOpInIn UnitsTypeObjectData to set
 *
 */
  public void setUnitsType(UnitsTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UnitsType passed into the constructor
 * @return Simulated response
 *
 */
  public UnitsTypeObjectData getUnitsType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UnitsTypeObjectHelper.fromMap(inputMap, "UnitsType");
  }
}
