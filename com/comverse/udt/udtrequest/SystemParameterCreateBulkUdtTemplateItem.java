/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SystemParameterCreateBulkUdtTemplateItem.java
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
 * Class used to create a SystemParameterCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class SystemParameterCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SPObjectData SPCreateIn;
/**
 *
 * Constructor to create a  SystemParameterCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SystemParameterCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, SPObjectData SPCreateInIn) {
    super(id, context, "SystemParameterCreate");
    SPCreateIn = SPCreateInIn;
  }

  public void translateToMap() {
    if (SPCreateIn != null) {
      SPCreateIn.resetFlags(true, true);
      addInput("SystemParameter", SPObjectHelper.toMap(SPCreateIn, new HashMap(), "SystemParameter").get("SystemParameter"));
    }
  }


/**
 *
 * Sets the SystemParameter
 * @param SPCreateInIn Value of the SPCreateIn
 *
 */

  public void setSystemParameter(SPObjectData SPCreateInIn) {
    SPCreateIn = SPCreateInIn;
  }

  public void translateFromMap() {
    SPCreateIn = SPObjectHelper.fromMap(inputMap, "SystemParameter");
  }

/**
 *
 * Gets the SystemParameter
 * @return Value of the SystemParameter
 *
 */

  public SPObjectData getSystemParameter( ) {
    return SPCreateIn;
  }

}
