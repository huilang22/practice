/*
 * Generated code DO NOT EDIT
 * Generated file: ContactFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ContactFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ContactFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ContactObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ContactFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ContactFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ContactObjectDataList noOpInIn) {
    super(id, context, "ContactFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = ContactObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Contact", noOpIn);
      }
      addInput("Contact", mapList);
    }
  }
/**
 *
 * Sets the  Contact
 * @param noOpInIn ContactObjectDataList to set
 *
 */
  public void setContact(ContactObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Contact passed into the constructor
 * @return Simulated response
 *
 */
  public ContactObjectDataList getContact() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ContactObjectHelper.fromMapList(inputMap, "ContactList");
  }
}
