/*
 * Generated code DO NOT EDIT
 * Generated file: UnitsTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a UnitsTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class UnitsTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected UnitsTypeObjectKeyData utGetIn;
/**
 *
 * Constructor to create a  UnitsTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnitsTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, UnitsTypeObjectKeyData utGetInIn) {
    super(id, context, "UnitsTypeGet");
    utGetIn = utGetInIn;
  }

  public void translateToMap() {
    if (utGetIn != null) {
      utGetIn.resetFlags(true, true);
      addInput("UnitsType", UnitsTypeObjectKeyHelper.toMap(utGetIn, new HashMap(), "UnitsTypeObjectKeyData").get("UnitsTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the UnitsType
 * @param utGetInIn Value of the utGetIn
 *
 */

  public void setUnitsType(UnitsTypeObjectKeyData utGetInIn) {
    utGetIn = utGetInIn;
  }

  public void translateFromMap() {
    utGetIn = UnitsTypeObjectKeyHelper.fromMap(inputMap, "UnitsType");
  }

/**
 *
 * Gets the UnitsType
 * @return Value of the UnitsType
 *
 */

  public UnitsTypeObjectKeyData getUnitsType( ) {
    return utGetIn;
  }

}
