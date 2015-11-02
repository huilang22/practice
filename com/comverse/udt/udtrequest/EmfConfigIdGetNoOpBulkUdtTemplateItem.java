/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigIdGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a EmfConfigIdGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class EmfConfigIdGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ECIObjectData noOpIn;

/**
 *
 * Constructor to create a   EmfConfigIdGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public EmfConfigIdGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ECIObjectData noOpInIn) {
    super(id, context, "EmfConfigIdGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("EmfConfigId", ECIObjectHelper.toMap(noOpIn, new HashMap(), "EmfConfigId").get("EmfConfigId"));
    }
  }
/**
 *
 * Sets the  EmfConfigId
 * @param noOpInIn ECIObjectData to set
 *
 */
  public void setEmfConfigId(ECIObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the EmfConfigId passed into the constructor
 * @return Simulated response
 *
 */
  public ECIObjectData getEmfConfigId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ECIObjectHelper.fromMap(inputMap, "EmfConfigId");
  }
}
