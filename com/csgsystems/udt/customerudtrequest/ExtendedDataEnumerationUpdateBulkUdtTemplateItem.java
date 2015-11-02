/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataEnumerationUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ExtendedDataEnumerationUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataEnumerationUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EDObjectData EDUpdateIn;
/**
 *
 * Constructor to create a  ExtendedDataEnumerationUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataEnumerationUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, EDObjectData EDUpdateInIn) {
    super(id, context, "ExtendedDataEnumerationUpdate");
    EDUpdateIn = EDUpdateInIn;
  }

  public void translateToMap() {
    if (EDUpdateIn != null) {
      EDUpdateIn.resetFlags(true, true);
      addInput("ExtendedDataEnumeration", EDObjectHelper.toMap(EDUpdateIn, new HashMap(), "ExtendedDataEnumeration").get("ExtendedDataEnumeration"));
    }
  }


/**
 *
 * Sets the ExtendedDataEnumeration
 * @param EDUpdateInIn Value of the EDUpdateIn
 *
 */

  public void setExtendedDataEnumeration(EDObjectData EDUpdateInIn) {
    EDUpdateIn = EDUpdateInIn;
  }

  public void translateFromMap() {
    EDUpdateIn = EDObjectHelper.fromMap(inputMap, "ExtendedDataEnumeration");
  }

/**
 *
 * Gets the ExtendedDataEnumeration
 * @return Value of the ExtendedDataEnumeration
 *
 */

  public EDObjectData getExtendedDataEnumeration( ) {
    return EDUpdateIn;
  }

}
