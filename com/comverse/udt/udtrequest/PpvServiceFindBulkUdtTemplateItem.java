/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PpvServiceFindBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;
import com.csgsystems.om.data.*;
import com.csgsystems.ppv.data.*;

/**
 *
 * Class used to create a PpvServiceFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PpvServiceFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PpvServiceObjectFilter FindIn;
  protected Integer account_internal_id;
/**
 *
 * Constructor to create a  PpvServiceFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PpvServiceFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PpvServiceObjectFilter FindInIn, Integer account_internal_idIn) {
    super(id, context, "PpvServiceFind");
    FindIn = FindInIn;
    account_internal_id = account_internal_idIn;
  }

  public void translateToMap() {
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PpvService", PpvServiceObjectHelper.toMap(FindIn, new HashMap(), "PpvService").get("PpvService"));
    }
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
  }


/**
 *
 * Sets the PpvService
 * @param FindInIn Value of the FindIn
 *
 */

  public void setPpvService(PpvServiceObjectFilter FindInIn) {
    FindIn = FindInIn;
  }

/**
 *
 * Sets the AccountInternalId
 * @param account_internal_idIn Value of the account_internal_id
 *
 */

  public void setAccountInternalId(Integer account_internal_idIn) {
    account_internal_id = account_internal_idIn;
  }

  public void translateFromMap() {
    FindIn = PpvServiceObjectHelper.fromMapFilter(inputMap, "PpvService");
    account_internal_id = (Integer)inputMap.get("AccountInternalId");
  }

/**
 *
 * Gets the PpvService
 * @return Value of the PpvService
 *
 */

  public PpvServiceObjectFilter getPpvService( ) {
    return FindIn;
  }

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return account_internal_id;
  }

}
