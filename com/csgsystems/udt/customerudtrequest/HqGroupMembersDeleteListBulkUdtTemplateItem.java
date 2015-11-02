/*
 * Generated code DO NOT EDIT
 * Generated file: HqGroupMembersDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a HqGroupMembersDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class HqGroupMembersDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected HqGroupMembersObjectFilter HGMDlIn;
  protected Date HGMDlInactiveDate;
  protected Integer HGMDlDiscRe;
/**
 *
 * Constructor to create a  HqGroupMembersDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public HqGroupMembersDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, HqGroupMembersObjectFilter HGMDlInIn, Date HGMDlInactiveDateIn, Integer HGMDlDiscReIn) {
    super(id, context, "HqGroupMembersDeleteList");
    HGMDlIn = HGMDlInIn;
    HGMDlInactiveDate = HGMDlInactiveDateIn;
    HGMDlDiscRe = HGMDlDiscReIn;
  }

  public void translateToMap() {
    if (HGMDlIn != null) {
      Integer index =  HGMDlIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupMembers", HqGroupMembersObjectHelper.toMap(HGMDlIn, new HashMap(), "HqGroupMembers").get("HqGroupMembers"));
    }
    if (HGMDlInactiveDate != null) {
      addInput("HGMDlInactiveDate", HGMDlInactiveDate);
    }
    if (HGMDlDiscRe != null) {
      addInput("HGMDlDiscRe", HGMDlDiscRe);
    }
  }


/**
 *
 * Sets the HqGroupMembers
 * @param HGMDlInIn Value of the HGMDlIn
 *
 */

  public void setHqGroupMembers(HqGroupMembersObjectFilter HGMDlInIn) {
    HGMDlIn = HGMDlInIn;
  }

/**
 *
 * Sets the HGMDlInactiveDate
 * @param HGMDlInactiveDateIn Value of the HGMDlInactiveDate
 *
 */

  public void setHGMDlInactiveDate(Date HGMDlInactiveDateIn) {
    HGMDlInactiveDate = HGMDlInactiveDateIn;
  }

/**
 *
 * Sets the HGMDlDiscRe
 * @param HGMDlDiscReIn Value of the HGMDlDiscRe
 *
 */

  public void setHGMDlDiscRe(Integer HGMDlDiscReIn) {
    HGMDlDiscRe = HGMDlDiscReIn;
  }

  public void translateFromMap() {
    HGMDlIn = HqGroupMembersObjectHelper.fromMapFilter(inputMap, "HqGroupMembers");
    HGMDlInactiveDate = (Date)inputMap.get("HGMDlInactiveDate");
    HGMDlDiscRe = (Integer)inputMap.get("HGMDlDiscRe");
  }

/**
 *
 * Gets the HqGroupMembers
 * @return Value of the HqGroupMembers
 *
 */

  public HqGroupMembersObjectFilter getHqGroupMembers( ) {
    return HGMDlIn;
  }

/**
 *
 * Gets the HGMDlInactiveDate
 * @return Value of the HGMDlInactiveDate
 *
 */

  public Date getHGMDlInactiveDate( ) {
    return HGMDlInactiveDate;
  }

/**
 *
 * Gets the HGMDlDiscRe
 * @return Value of the HGMDlDiscRe
 *
 */

  public Integer getHGMDlDiscRe( ) {
    return HGMDlDiscRe;
  }

}
