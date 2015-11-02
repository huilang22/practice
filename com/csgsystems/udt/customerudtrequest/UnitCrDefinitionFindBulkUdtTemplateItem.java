/*
 * Generated code DO NOT EDIT
 * Generated file: UnitCrDefinitionFindBulkUdtTemplateItem.java
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
 * Class used to create a UnitCrDefinitionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitCrDefinitionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitCrDefinitionObjectFilter ucdFndIn;
/**
 *
 * Constructor to create a  UnitCrDefinitionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitCrDefinitionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitCrDefinitionObjectFilter ucdFndInIn) {
    super(id, context, "UnitCrDefinitionFind");
    ucdFndIn = ucdFndInIn;
  }

  public void translateToMap() {
    if (ucdFndIn != null) {
      Integer index =  ucdFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnitCrDefinition", UnitCrDefinitionObjectHelper.toMap(ucdFndIn, new HashMap(), "UnitCrDefinition").get("UnitCrDefinition"));
    }
  }


/**
 *
 * Sets the UnitCrDefinition
 * @param ucdFndInIn Value of the ucdFndIn
 *
 */

  public void setUnitCrDefinition(UnitCrDefinitionObjectFilter ucdFndInIn) {
    ucdFndIn = ucdFndInIn;
  }

  public void translateFromMap() {
    ucdFndIn = UnitCrDefinitionObjectHelper.fromMapFilter(inputMap, "UnitCrDefinition");
  }

/**
 *
 * Gets the UnitCrDefinition
 * @return Value of the UnitCrDefinition
 *
 */

  public UnitCrDefinitionObjectFilter getUnitCrDefinition( ) {
    return ucdFndIn;
  }

}
