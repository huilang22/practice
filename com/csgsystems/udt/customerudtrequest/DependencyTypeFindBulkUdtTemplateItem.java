/*
 * Generated code DO NOT EDIT
 * Generated file: DependencyTypeFindBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a DependencyTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class DependencyTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DependencyTypeObjectFilter DependencyTypeFindIn;
/**
 *
 * Constructor to create a  DependencyTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DependencyTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, DependencyTypeObjectFilter DependencyTypeFindInIn) {
    super(id, context, "DependencyTypeFind");
    DependencyTypeFindIn = DependencyTypeFindInIn;
  }

  public void translateToMap() {
    if (DependencyTypeFindIn != null) {
      Integer index =  DependencyTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DependencyType", DependencyTypeObjectHelper.toMap(DependencyTypeFindIn, new HashMap(), "DependencyType").get("DependencyType"));
    }
  }


/**
 *
 * Sets the DependencyType
 * @param DependencyTypeFindInIn Value of the DependencyTypeFindIn
 *
 */

  public void setDependencyType(DependencyTypeObjectFilter DependencyTypeFindInIn) {
    DependencyTypeFindIn = DependencyTypeFindInIn;
  }

  public void translateFromMap() {
    DependencyTypeFindIn = DependencyTypeObjectHelper.fromMapFilter(inputMap, "DependencyType");
  }

/**
 *
 * Gets the DependencyType
 * @return Value of the DependencyType
 *
 */

  public DependencyTypeObjectFilter getDependencyType( ) {
    return DependencyTypeFindIn;
  }

}
