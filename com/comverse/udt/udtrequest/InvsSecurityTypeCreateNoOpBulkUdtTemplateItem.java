/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSecurityTypeCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsSecurityTypeCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsSecurityTypeCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsSecurityTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsSecurityTypeCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsSecurityTypeCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsSecurityTypeObjectData noOpInIn) {
    super(id, context, "InvsSecurityTypeCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsSecurityType", InvsSecurityTypeObjectHelper.toMap(noOpIn, new HashMap(), "InvsSecurityType").get("InvsSecurityType"));
    }
  }
/**
 *
 * Sets the  InvsSecurityType
 * @param noOpInIn InvsSecurityTypeObjectData to set
 *
 */
  public void setInvsSecurityType(InvsSecurityTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsSecurityType passed into the constructor
 * @return Simulated response
 *
 */
  public InvsSecurityTypeObjectData getInvsSecurityType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsSecurityTypeObjectHelper.fromMap(inputMap, "InvsSecurityType");
  }
}
