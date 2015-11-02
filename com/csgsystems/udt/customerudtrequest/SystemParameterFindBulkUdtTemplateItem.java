/*
 * Generated code DO NOT EDIT
 * Generated file: SystemParameterFindBulkUdtTemplateItem.java
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
 * Class used to create a SystemParameterFindBulkUdtTemplateItem Bulk Template
 *
 */

public class SystemParameterFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected SPObjectFilter SPFindIn;
/**
 *
 * Constructor to create a  SystemParameterFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public SystemParameterFindBulkUdtTemplateItem(String id, BSDMSessionContext context, SPObjectFilter SPFindInIn) {
    super(id, context, "SystemParameterFind");
    SPFindIn = SPFindInIn;
  }

  public void translateToMap() {
    if (SPFindIn != null) {
      Integer index =  SPFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SystemParameter", SPObjectHelper.toMap(SPFindIn, new HashMap(), "SystemParameter").get("SystemParameter"));
    }
  }


/**
 *
 * Sets the SystemParameter
 * @param SPFindInIn Value of the SPFindIn
 *
 */

  public void setSystemParameter(SPObjectFilter SPFindInIn) {
    SPFindIn = SPFindInIn;
  }

  public void translateFromMap() {
    SPFindIn = SPObjectHelper.fromMapFilter(inputMap, "SystemParameter");
  }

/**
 *
 * Gets the SystemParameter
 * @return Value of the SystemParameter
 *
 */

  public SPObjectFilter getSystemParameter( ) {
    return SPFindIn;
  }

}
