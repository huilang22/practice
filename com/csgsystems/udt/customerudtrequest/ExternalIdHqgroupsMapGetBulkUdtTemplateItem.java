/*
 * Generated code DO NOT EDIT
 * Generated file: ExternalIdHqgroupsMapGetBulkUdtTemplateItem.java
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
 * Class used to create a ExternalIdHqgroupsMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ExternalIdHqgroupsMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EIHGMObjectKeyData getIn;
/**
 *
 * Constructor to create a  ExternalIdHqgroupsMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExternalIdHqgroupsMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, EIHGMObjectKeyData getInIn) {
    super(id, context, "ExternalIdHqgroupsMapGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("ExternalIdHqGroupsMap", EIHGMObjectKeyHelper.toMap(getIn, new HashMap(), "EIHGMObjectKeyData").get("EIHGMObjectKeyData"));
    }
  }


/**
 *
 * Sets the ExternalIdHqGroupsMap
 * @param getInIn Value of the getIn
 *
 */

  public void setExternalIdHqGroupsMap(EIHGMObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = EIHGMObjectKeyHelper.fromMap(inputMap, "ExternalIdHqGroupsMap");
  }

/**
 *
 * Gets the ExternalIdHqGroupsMap
 * @return Value of the ExternalIdHqGroupsMap
 *
 */

  public EIHGMObjectKeyData getExternalIdHqGroupsMap( ) {
    return getIn;
  }

}
