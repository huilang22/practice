/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenderTypeGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a GenderTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GenderTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GenderTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   GenderTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GenderTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GenderTypeObjectData noOpInIn) {
    super(id, context, "GenderTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("GenderType", GenderTypeObjectHelper.toMap(noOpIn, new HashMap(), "GenderType").get("GenderType"));
    }
  }
/**
 *
 * Sets the  GenderType
 * @param noOpInIn GenderTypeObjectData to set
 *
 */
  public void setGenderType(GenderTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GenderType passed into the constructor
 * @return Simulated response
 *
 */
  public GenderTypeObjectData getGenderType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GenderTypeObjectHelper.fromMap(inputMap, "GenderType");
  }
}
