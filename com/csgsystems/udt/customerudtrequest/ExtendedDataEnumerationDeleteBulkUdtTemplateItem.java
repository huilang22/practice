/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataEnumerationDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ExtendedDataEnumerationDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataEnumerationDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EDObjectKeyData EDDeleteIn;
/**
 *
 * Constructor to create a  ExtendedDataEnumerationDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataEnumerationDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, EDObjectKeyData EDDeleteInIn) {
    super(id, context, "ExtendedDataEnumerationDelete");
    EDDeleteIn = EDDeleteInIn;
  }

  public void translateToMap() {
    if (EDDeleteIn != null) {
      EDDeleteIn.resetFlags(true, true);
      addInput("ExtendedDataEnumeration", EDObjectKeyHelper.toMap(EDDeleteIn, new HashMap(), "EDObjectKeyData").get("EDObjectKeyData"));
    }
  }


/**
 *
 * Sets the ExtendedDataEnumeration
 * @param EDDeleteInIn Value of the EDDeleteIn
 *
 */

  public void setExtendedDataEnumeration(EDObjectKeyData EDDeleteInIn) {
    EDDeleteIn = EDDeleteInIn;
  }

  public void translateFromMap() {
    EDDeleteIn = EDObjectKeyHelper.fromMap(inputMap, "ExtendedDataEnumeration");
  }

/**
 *
 * Gets the ExtendedDataEnumeration
 * @return Value of the ExtendedDataEnumeration
 *
 */

  public EDObjectKeyData getExtendedDataEnumeration( ) {
    return EDDeleteIn;
  }

}
