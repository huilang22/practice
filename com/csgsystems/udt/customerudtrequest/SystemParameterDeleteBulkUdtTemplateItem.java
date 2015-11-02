/*
 * Generated code DO NOT EDIT
 * Generated file: SystemParameterDeleteBulkUdtTemplateItem.java
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
 * Class used to create a SystemParameterDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class SystemParameterDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SPObjectKeyData SPDeleteIn;
/**
 *
 * Constructor to create a  SystemParameterDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SystemParameterDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, SPObjectKeyData SPDeleteInIn) {
    super(id, context, "SystemParameterDelete");
    SPDeleteIn = SPDeleteInIn;
  }

  public void translateToMap() {
    if (SPDeleteIn != null) {
      SPDeleteIn.resetFlags(true, true);
      addInput("SystemParameter", SPObjectKeyHelper.toMap(SPDeleteIn, new HashMap(), "SPObjectKeyData").get("SPObjectKeyData"));
    }
  }


/**
 *
 * Sets the SystemParameter
 * @param SPDeleteInIn Value of the SPDeleteIn
 *
 */

  public void setSystemParameter(SPObjectKeyData SPDeleteInIn) {
    SPDeleteIn = SPDeleteInIn;
  }

  public void translateFromMap() {
    SPDeleteIn = SPObjectKeyHelper.fromMap(inputMap, "SystemParameter");
  }

/**
 *
 * Gets the SystemParameter
 * @return Value of the SystemParameter
 *
 */

  public SPObjectKeyData getSystemParameter( ) {
    return SPDeleteIn;
  }

}
