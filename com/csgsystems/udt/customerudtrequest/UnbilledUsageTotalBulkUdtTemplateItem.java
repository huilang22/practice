/*
 * Generated code DO NOT EDIT
 * Generated file: UnbilledUsageTotalBulkUdtTemplateItem.java
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
 * Class used to create a UnbilledUsageTotalBulkUdtTemplateItem Bulk Template
 *
 */

public class UnbilledUsageTotalBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected String AccountExternalId;
  protected Integer AccountExternalIdType;
  protected String ServiceExternalId;
  protected Integer ServiceExternalIdType;
/**
 *
 * Constructor to create a  UnbilledUsageTotalBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public UnbilledUsageTotalBulkUdtTemplateItem(String id, BSDMSessionContext context, String AccountExternalIdIn, Integer AccountExternalIdTypeIn, String ServiceExternalIdIn, Integer ServiceExternalIdTypeIn) {
    super(id, context, "UnbilledUsageTotal");
    AccountExternalId = AccountExternalIdIn;
    AccountExternalIdType = AccountExternalIdTypeIn;
    ServiceExternalId = ServiceExternalIdIn;
    ServiceExternalIdType = ServiceExternalIdTypeIn;
  }

  public void translateToMap() {
    if (AccountExternalId != null) {
      addInput("AccountExternalId", AccountExternalId);
    }
    if (AccountExternalIdType != null) {
      addInput("AccountExternalIdType", AccountExternalIdType);
    }
    if (ServiceExternalId != null) {
      addInput("ServiceExternalId", ServiceExternalId);
    }
    if (ServiceExternalIdType != null) {
      addInput("ServiceExternalIdType", ServiceExternalIdType);
    }
  }


/**
 *
 * Sets the AccountExternalId
 * @param AccountExternalIdIn Value of the AccountExternalId
 *
 */

  public void setAccountExternalId(String AccountExternalIdIn) {
    AccountExternalId = AccountExternalIdIn;
  }

/**
 *
 * Sets the AccountExternalIdType
 * @param AccountExternalIdTypeIn Value of the AccountExternalIdType
 *
 */

  public void setAccountExternalIdType(Integer AccountExternalIdTypeIn) {
    AccountExternalIdType = AccountExternalIdTypeIn;
  }

/**
 *
 * Sets the ServiceExternalId
 * @param ServiceExternalIdIn Value of the ServiceExternalId
 *
 */

  public void setServiceExternalId(String ServiceExternalIdIn) {
    ServiceExternalId = ServiceExternalIdIn;
  }

/**
 *
 * Sets the ServiceExternalIdType
 * @param ServiceExternalIdTypeIn Value of the ServiceExternalIdType
 *
 */

  public void setServiceExternalIdType(Integer ServiceExternalIdTypeIn) {
    ServiceExternalIdType = ServiceExternalIdTypeIn;
  }

  public void translateFromMap() {
    AccountExternalId = (String)inputMap.get("AccountExternalId");
    AccountExternalIdType = (Integer)inputMap.get("AccountExternalIdType");
    ServiceExternalId = (String)inputMap.get("ServiceExternalId");
    ServiceExternalIdType = (Integer)inputMap.get("ServiceExternalIdType");
  }

/**
 *
 * Gets the AccountExternalId
 * @return Value of the AccountExternalId
 *
 */

  public String getAccountExternalId( ) {
    return AccountExternalId;
  }

/**
 *
 * Gets the AccountExternalIdType
 * @return Value of the AccountExternalIdType
 *
 */

  public Integer getAccountExternalIdType( ) {
    return AccountExternalIdType;
  }

/**
 *
 * Gets the ServiceExternalId
 * @return Value of the ServiceExternalId
 *
 */

  public String getServiceExternalId( ) {
    return ServiceExternalId;
  }

/**
 *
 * Gets the ServiceExternalIdType
 * @return Value of the ServiceExternalIdType
 *
 */

  public Integer getServiceExternalIdType( ) {
    return ServiceExternalIdType;
  }

}
