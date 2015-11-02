/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataEnumerationGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ExtendedDataEnumerationGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataEnumerationGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EDObjectKeyData EDGetIn;
/**
 *
 * Constructor to create a  ExtendedDataEnumerationGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataEnumerationGetBulkUdtTemplateItem(String id, BSDMSessionContext context, EDObjectKeyData EDGetInIn) {
    super(id, context, "ExtendedDataEnumerationGet");
    EDGetIn = EDGetInIn;
  }

  public void translateToMap() {
    if (EDGetIn != null) {
      EDGetIn.resetFlags(true, true);
      addInput("ExtendedDataEnumeration", EDObjectKeyHelper.toMap(EDGetIn, new HashMap(), "EDObjectKeyData").get("EDObjectKeyData"));
    }
  }


/**
 *
 * Sets the ExtendedDataEnumeration
 * @param EDGetInIn Value of the EDGetIn
 *
 */

  public void setExtendedDataEnumeration(EDObjectKeyData EDGetInIn) {
    EDGetIn = EDGetInIn;
  }

  public void translateFromMap() {
    EDGetIn = EDObjectKeyHelper.fromMap(inputMap, "ExtendedDataEnumeration");
  }

/**
 *
 * Gets the ExtendedDataEnumeration
 * @return Value of the ExtendedDataEnumeration
 *
 */

  public EDObjectKeyData getExtendedDataEnumeration( ) {
    return EDGetIn;
  }

}
