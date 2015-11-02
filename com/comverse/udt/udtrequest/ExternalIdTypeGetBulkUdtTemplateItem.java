/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeGetBulkUdtTemplateItem.java
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
 * Class used to create a ExternalIdTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ExternalIdTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExternalIdTypeObjectKeyData EITGetIn;
/**
 *
 * Constructor to create a  ExternalIdTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExternalIdTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ExternalIdTypeObjectKeyData EITGetInIn) {
    super(id, context, "ExternalIdTypeGet");
    EITGetIn = EITGetInIn;
  }

  public void translateToMap() {
    if (EITGetIn != null) {
      EITGetIn.resetFlags(true, true);
      addInput("ExternalIdType", ExternalIdTypeObjectKeyHelper.toMap(EITGetIn, new HashMap(), "ExternalIdTypeObjectKeyData").get("ExternalIdTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the ExternalIdType
 * @param EITGetInIn Value of the EITGetIn
 *
 */

  public void setExternalIdType(ExternalIdTypeObjectKeyData EITGetInIn) {
    EITGetIn = EITGetInIn;
  }

  public void translateFromMap() {
    EITGetIn = ExternalIdTypeObjectKeyHelper.fromMap(inputMap, "ExternalIdType");
  }

/**
 *
 * Gets the ExternalIdType
 * @return Value of the ExternalIdType
 *
 */

  public ExternalIdTypeObjectKeyData getExternalIdType( ) {
    return EITGetIn;
  }

}
