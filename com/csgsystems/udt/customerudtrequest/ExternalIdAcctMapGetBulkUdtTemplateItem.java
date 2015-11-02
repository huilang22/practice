/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdAcctMapGetBulkUdtTemplateItem.java
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
 * Class used to create a ExternalIdAcctMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ExternalIdAcctMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EIAMObjectKeyData getIn;
/**
 *
 * Constructor to create a  ExternalIdAcctMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExternalIdAcctMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, EIAMObjectKeyData getInIn) {
    super(id, context, "ExternalIdAcctMapGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("ExternalIdAcctMap", EIAMObjectKeyHelper.toMap(getIn, new HashMap(), "EIAMObjectKeyData").get("EIAMObjectKeyData"));
    }
  }


/**
 *
 * Sets the ExternalIdAcctMap
 * @param getInIn Value of the getIn
 *
 */

  public void setExternalIdAcctMap(EIAMObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = EIAMObjectKeyHelper.fromMap(inputMap, "ExternalIdAcctMap");
  }

/**
 *
 * Gets the ExternalIdAcctMap
 * @return Value of the ExternalIdAcctMap
 *
 */

  public EIAMObjectKeyData getExternalIdAcctMap( ) {
    return getIn;
  }

}
