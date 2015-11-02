/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SystemParameterGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SystemParameterGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SystemParameterGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SPObjectData noOpIn;

/**
 *
 * Constructor to create a   SystemParameterGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SystemParameterGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SPObjectData noOpInIn) {
    super(id, context, "SystemParameterGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("SystemParameter", SPObjectHelper.toMap(noOpIn, new HashMap(), "SystemParameter").get("SystemParameter"));
    }
  }
/**
 *
 * Sets the  SystemParameter
 * @param noOpInIn SPObjectData to set
 *
 */
  public void setSystemParameter(SPObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SystemParameter passed into the constructor
 * @return Simulated response
 *
 */
  public SPObjectData getSystemParameter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SPObjectHelper.fromMap(inputMap, "SystemParameter");
  }
}
