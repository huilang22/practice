/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a ExternalIdTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class ExternalIdTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExternalIdTypeObjectKeyData EITDeleteIn;
/**
 *
 * Constructor to create a  ExternalIdTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExternalIdTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ExternalIdTypeObjectKeyData EITDeleteInIn) {
    super(id, context, "ExternalIdTypeDelete");
    EITDeleteIn = EITDeleteInIn;
  }

  public void translateToMap() {
    if (EITDeleteIn != null) {
      EITDeleteIn.resetFlags(true, true);
      addInput("ExternalIdType", ExternalIdTypeObjectKeyHelper.toMap(EITDeleteIn, new HashMap(), "ExternalIdTypeObjectKeyData").get("ExternalIdTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the ExternalIdType
 * @param EITDeleteInIn Value of the EITDeleteIn
 *
 */

  public void setExternalIdType(ExternalIdTypeObjectKeyData EITDeleteInIn) {
    EITDeleteIn = EITDeleteInIn;
  }

  public void translateFromMap() {
    EITDeleteIn = ExternalIdTypeObjectKeyHelper.fromMap(inputMap, "ExternalIdType");
  }

/**
 *
 * Gets the ExternalIdType
 * @return Value of the ExternalIdType
 *
 */

  public ExternalIdTypeObjectKeyData getExternalIdType( ) {
    return EITDeleteIn;
  }

}
