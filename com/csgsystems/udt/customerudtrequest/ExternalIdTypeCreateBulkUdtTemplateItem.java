/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a ExternalIdTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExternalIdTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ExternalIdTypeObjectData EITCreateIn;
/**
 *
 * Constructor to create a  ExternalIdTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExternalIdTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ExternalIdTypeObjectData EITCreateInIn) {
    super(id, context, "ExternalIdTypeCreate");
    EITCreateIn = EITCreateInIn;
  }

  public void translateToMap() {
    if (EITCreateIn != null) {
      EITCreateIn.resetFlags(true, true);
      addInput("ExternalIdType", ExternalIdTypeObjectHelper.toMap(EITCreateIn, new HashMap(), "ExternalIdType").get("ExternalIdType"));
    }
  }


/**
 *
 * Sets the ExternalIdType
 * @param EITCreateInIn Value of the EITCreateIn
 *
 */

  public void setExternalIdType(ExternalIdTypeObjectData EITCreateInIn) {
    EITCreateIn = EITCreateInIn;
  }

  public void translateFromMap() {
    EITCreateIn = ExternalIdTypeObjectHelper.fromMap(inputMap, "ExternalIdType");
  }

/**
 *
 * Gets the ExternalIdType
 * @return Value of the ExternalIdType
 *
 */

  public ExternalIdTypeObjectData getExternalIdType( ) {
    return EITCreateIn;
  }

}
