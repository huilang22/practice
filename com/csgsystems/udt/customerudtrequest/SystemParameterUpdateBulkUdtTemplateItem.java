/*
 * Generated code DO NOT EDIT
 * Generated file: SystemParameterUpdateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a SystemParameterUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class SystemParameterUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SPObjectData SPUpdateIn;
/**
 *
 * Constructor to create a  SystemParameterUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SystemParameterUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, SPObjectData SPUpdateInIn) {
    super(id, context, "SystemParameterUpdate");
    SPUpdateIn = SPUpdateInIn;
  }

  public void translateToMap() {
    if (SPUpdateIn != null) {
      SPUpdateIn.resetFlags(true, true);
      addInput("SystemParameter", SPObjectHelper.toMap(SPUpdateIn, new HashMap(), "SystemParameter").get("SystemParameter"));
    }
  }


/**
 *
 * Sets the SystemParameter
 * @param SPUpdateInIn Value of the SPUpdateIn
 *
 */

  public void setSystemParameter(SPObjectData SPUpdateInIn) {
    SPUpdateIn = SPUpdateInIn;
  }

  public void translateFromMap() {
    SPUpdateIn = SPObjectHelper.fromMap(inputMap, "SystemParameter");
  }

/**
 *
 * Gets the SystemParameter
 * @return Value of the SystemParameter
 *
 */

  public SPObjectData getSystemParameter( ) {
    return SPUpdateIn;
  }

}
