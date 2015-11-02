/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsCreateBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupsCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupsCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupsObjectData hgcIn;
  protected String AccountExternalId;
  protected Integer AccountExternalIdType;
/**
 *
 * Constructor to create a  HqGroupsCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupsCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupsObjectData hgcInIn, String AccountExternalIdIn, Integer AccountExternalIdTypeIn) {
    super(id, context, "HqGroupsCreate");
    hgcIn = hgcInIn;
    AccountExternalId = AccountExternalIdIn;
    AccountExternalIdType = AccountExternalIdTypeIn;
  }

  public void translateToMap() {
    if (hgcIn != null) {
      hgcIn.resetFlags(true, true);
      addInput("HqGroups", HqGroupsObjectHelper.toMap(hgcIn, new HashMap(), "HqGroups").get("HqGroups"));
    }
    if (AccountExternalId != null) {
      addInput("AccountExternalId", AccountExternalId);
    }
    if (AccountExternalIdType != null) {
      addInput("AccountExternalIdType", AccountExternalIdType);
    }
  }


/**
 *
 * Sets the HqGroups
 * @param hgcInIn Value of the hgcIn
 *
 */

  public void setHqGroups(HqGroupsObjectData hgcInIn) {
    hgcIn = hgcInIn;
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

  public void translateFromMap() {
    hgcIn = HqGroupsObjectHelper.fromMap(inputMap, "HqGroups");
    AccountExternalId = (String)inputMap.get("AccountExternalId");
    AccountExternalIdType = (Integer)inputMap.get("AccountExternalIdType");
  }

/**
 *
 * Gets the HqGroups
 * @return Value of the HqGroups
 *
 */

  public HqGroupsObjectData getHqGroups( ) {
    return hgcIn;
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

}
