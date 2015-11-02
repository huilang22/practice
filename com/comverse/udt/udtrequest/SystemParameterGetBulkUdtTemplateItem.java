/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SystemParameterGetBulkUdtTemplateItem.java
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
 * Class used to create a SystemParameterGetBulkUdtTemplateItem Bulk Template
 *
 */

public class SystemParameterGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SPObjectKeyData SPGetIn;
/**
 *
 * Constructor to create a  SystemParameterGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SystemParameterGetBulkUdtTemplateItem(String id, BSDMSessionContext context, SPObjectKeyData SPGetInIn) {
    super(id, context, "SystemParameterGet");
    SPGetIn = SPGetInIn;
  }

  public void translateToMap() {
    if (SPGetIn != null) {
      SPGetIn.resetFlags(true, true);
      addInput("SystemParameter", SPObjectKeyHelper.toMap(SPGetIn, new HashMap(), "SPObjectKeyData").get("SPObjectKeyData"));
    }
  }


/**
 *
 * Sets the SystemParameter
 * @param SPGetInIn Value of the SPGetIn
 *
 */

  public void setSystemParameter(SPObjectKeyData SPGetInIn) {
    SPGetIn = SPGetInIn;
  }

  public void translateFromMap() {
    SPGetIn = SPObjectKeyHelper.fromMap(inputMap, "SystemParameter");
  }

/**
 *
 * Gets the SystemParameter
 * @return Value of the SystemParameter
 *
 */

  public SPObjectKeyData getSystemParameter( ) {
    return SPGetIn;
  }

}
