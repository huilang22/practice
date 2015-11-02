/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContactGetBulkUdtTemplateItem.java
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
 * Class used to create a ContactGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ContactGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ContactObjectKeyData ContactgetIn;
/**
 *
 * Constructor to create a  ContactGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContactGetBulkUdtTemplateItem(String id, BSDMSessionContext context, ContactObjectKeyData ContactgetInIn) {
    super(id, context, "ContactGet");
    ContactgetIn = ContactgetInIn;
  }

  public void translateToMap() {
    if (ContactgetIn != null) {
      ContactgetIn.resetFlags(true, true);
      addInput("Contact", ContactObjectKeyHelper.toMap(ContactgetIn, new HashMap(), "ContactObjectKeyData").get("ContactObjectKeyData"));
    }
  }


/**
 *
 * Sets the Contact
 * @param ContactgetInIn Value of the ContactgetIn
 *
 */

  public void setContact(ContactObjectKeyData ContactgetInIn) {
    ContactgetIn = ContactgetInIn;
  }

  public void translateFromMap() {
    ContactgetIn = ContactObjectKeyHelper.fromMap(inputMap, "Contact");
  }

/**
 *
 * Gets the Contact
 * @return Value of the Contact
 *
 */

  public ContactObjectKeyData getContact( ) {
    return ContactgetIn;
  }

}
