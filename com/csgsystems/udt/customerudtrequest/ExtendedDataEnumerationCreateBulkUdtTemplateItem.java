/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataEnumerationCreateBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ExtendedDataEnumerationCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataEnumerationCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EDObjectData EDCreateIn;
/**
 *
 * Constructor to create a  ExtendedDataEnumerationCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataEnumerationCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, EDObjectData EDCreateInIn) {
    super(id, context, "ExtendedDataEnumerationCreate");
    EDCreateIn = EDCreateInIn;
  }

  public void translateToMap() {
    if (EDCreateIn != null) {
      EDCreateIn.resetFlags(true, true);
      addInput("ExtendedDataEnumeration", EDObjectHelper.toMap(EDCreateIn, new HashMap(), "ExtendedDataEnumeration").get("ExtendedDataEnumeration"));
    }
  }


/**
 *
 * Sets the ExtendedDataEnumeration
 * @param EDCreateInIn Value of the EDCreateIn
 *
 */

  public void setExtendedDataEnumeration(EDObjectData EDCreateInIn) {
    EDCreateIn = EDCreateInIn;
  }

  public void translateFromMap() {
    EDCreateIn = EDObjectHelper.fromMap(inputMap, "ExtendedDataEnumeration");
  }

/**
 *
 * Gets the ExtendedDataEnumeration
 * @return Value of the ExtendedDataEnumeration
 *
 */

  public EDObjectData getExtendedDataEnumeration( ) {
    return EDCreateIn;
  }

}
