/*
 * Generated code DO NOT EDIT
 * Generated file: ContactUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ContactUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ContactUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContactObjectData ContactUpdateIn;
/**
 *
 * Constructor to create a  ContactUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContactUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ContactObjectData ContactUpdateInIn) {
    super(id, context, "ContactUpdate");
    ContactUpdateIn = ContactUpdateInIn;
  }

  public void translateToMap() {
    if (ContactUpdateIn != null) {
      ContactUpdateIn.resetFlags(true, true);
      addInput("Contact", ContactObjectHelper.toMap(ContactUpdateIn, new HashMap(), "Contact").get("Contact"));
    }
  }


/**
 *
 * Sets the Contact
 * @param ContactUpdateInIn Value of the ContactUpdateIn
 *
 */

  public void setContact(ContactObjectData ContactUpdateInIn) {
    ContactUpdateIn = ContactUpdateInIn;
  }

  public void translateFromMap() {
    ContactUpdateIn = ContactObjectHelper.fromMap(inputMap, "Contact");
  }

/**
 *
 * Gets the Contact
 * @return Value of the Contact
 *
 */

  public ContactObjectData getContact( ) {
    return ContactUpdateIn;
  }

}
