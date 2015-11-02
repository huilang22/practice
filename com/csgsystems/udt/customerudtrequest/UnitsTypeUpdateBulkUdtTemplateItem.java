/*
 * Generated code DO NOT EDIT
 * Generated file: UnitsTypeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a UnitsTypeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitsTypeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitsTypeObjectData utUpdIn;
/**
 *
 * Constructor to create a  UnitsTypeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitsTypeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitsTypeObjectData utUpdInIn) {
    super(id, context, "UnitsTypeUpdate");
    utUpdIn = utUpdInIn;
  }

  public void translateToMap() {
    if (utUpdIn != null) {
      utUpdIn.resetFlags(true, true);
      addInput("UnitsType", UnitsTypeObjectHelper.toMap(utUpdIn, new HashMap(), "UnitsType").get("UnitsType"));
    }
  }


/**
 *
 * Sets the UnitsType
 * @param utUpdInIn Value of the utUpdIn
 *
 */

  public void setUnitsType(UnitsTypeObjectData utUpdInIn) {
    utUpdIn = utUpdInIn;
  }

  public void translateFromMap() {
    utUpdIn = UnitsTypeObjectHelper.fromMap(inputMap, "UnitsType");
  }

/**
 *
 * Gets the UnitsType
 * @return Value of the UnitsType
 *
 */

  public UnitsTypeObjectData getUnitsType( ) {
    return utUpdIn;
  }

}
